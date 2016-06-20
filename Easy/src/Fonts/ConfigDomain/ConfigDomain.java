package Fonts.ConfigDomain;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author bruno.souza
 */
public class ConfigDomain {
 
    private DefaultTableModel modelCriar;
    private DefaultTableModel modelAlterar;
    private DefaultTableModel modelDeletar;

    public DefaultTableModel getModelCriar() {
        return modelCriar;
    }

    public void setModelCriar(DefaultTableModel modelCriar) {
        this.modelCriar = modelCriar;
    }

    public DefaultTableModel getModelAlterar() {
        return modelAlterar;
    }

    public void setModelAlterar(DefaultTableModel modelAlterar) {
        this.modelAlterar = modelAlterar;
    }

    public DefaultTableModel getModelDeletar() {
        return modelDeletar;
    }

    public void setModelDeletar(DefaultTableModel modelDeletar) {
        this.modelDeletar = modelDeletar;
    }
        
    public void tirarMouseBtnAcao(JButton btn){
        btn.setBackground(new Color(153,153,153));
    }
    
    public void colocarMouseBtnAcao(JButton btn){
        btn.setBackground(new Color(102, 102, 102));
    }    
    
    public void tirarMouseBtnAddDel(JButton btn){
        btn.setBackground(Color.WHITE);
    }
    
    public void colocarMouseBtnAddDel(JButton btn){
        btn.setBackground(new Color(230, 255, 255));
    }    
    
    public boolean existDomainXML(JTextField dirDomain){
        
        if(dirDomain.getText().isEmpty()){            
            return false;
        } else {            
            File f = new File(dirDomain.getText() + "\\config\\domain.xml");            
            if(!f.exists()){
                return false;
            } else {
                return true;
            }
        }
    }
    
    public void populaTabelaCriar(){
        this.modelCriar.addRow(new Object[]{"-Xrs"});
        this.modelCriar.addRow(new Object[]{"-Xmn512m"});
        this.modelCriar.addRow(new Object[]{"-Xms1024m"});
        this.modelCriar.addRow(new Object[]{"-XX:+CMSParallelRemarkEnabled"});
        this.modelCriar.addRow(new Object[]{"-XX:SurvivorRatio=20"});
        this.modelCriar.addRow(new Object[]{"-XX:+UseParNewGC"});
        this.modelCriar.addRow(new Object[]{"-XX:+UseConcMarkSweepGC"});
    }
    
    public void populaTabelaAlterar(){
        this.modelAlterar.addRow(new Object[]{"-XX:MaxPermSize=192m", "-XX:MaxPermSize=512m"});
        this.modelAlterar.addRow(new Object[]{"-client", "-server"});
        this.modelAlterar.addRow(new Object[]{"-Xmx512m", "-Xmx2048m"});
    }
    
    public void populaTabelaDeletar(){
        this.modelDeletar.addRow(new Object[]{"-XX:NewRatio=2"});
    }
    
    public void deleteTabelaCriar(){
        this.modelCriar.setRowCount(0);
    }
    
    public void deleteTabelaAlterar(){
        this.modelAlterar.setRowCount(0);
    }
    
    public void deleteTabelaDeletar(){
        this.modelDeletar.setRowCount(0);
    }
    
    public void backupDomainXml(File xmlFile, JTextField dirDomain) throws IOException, InterruptedException{
               
        Date data = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        
        Process p = Runtime.getRuntime().exec("cmd /C xcopy " + xmlFile.getAbsolutePath() + " %TEMP% /A");        
        p.waitFor();
        p.destroy();
        Runtime.getRuntime().exec("cmd /C ren %TEMP%\\" + xmlFile.getName() + " " + nomeDomain(dirDomain) + "-" + df.format(data) + ".xml");
    }
    
    public void stopDomain(boolean message, JTextField dirDomain) throws IOException, InterruptedException{
        
        File asadmin = new File(dirDomain.getText() + "\\..\\..\\bin\\asadmin.bat");
                
        Process p = Runtime.getRuntime().exec("cmd /C " + asadmin.getAbsolutePath() + " stop-domain " + nomeDomain(dirDomain));        
                
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        if(stdInput.readLine() != null){
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                
                if(s.contains("Command stop-domain executed successfully")){                    
                    
                    if(message){
                        JOptionPane.showMessageDialog(null, s);
                    }
                }
            }
        }
        
        if(stdError.readLine() != null){
            String s = null;
            while ((s = stdError.readLine()) != null) {                
                if(message){
                    JOptionPane.showMessageDialog(null, s);                
                }
            }
        }
        p.destroy();
    }
    
    public void startDomain(boolean message, JTextField dirDomain) throws IOException, InterruptedException{
        
        File asadmin = new File(dirDomain.getText() + "\\..\\..\\bin\\asadmin.bat");
                
        Process p = Runtime.getRuntime().exec("cmd /C " + asadmin.getAbsolutePath() + " start-domain " + nomeDomain(dirDomain));        
                
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        if(stdInput.readLine() != null){
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                
                if(s.contains("Command stop-domain executed successfully")){                    
                    
                    if(message){
                        JOptionPane.showMessageDialog(null, s);
                    }
                }
            }
        }
        
        if(stdError.readLine() != null){
            String s = null;
            while ((s = stdError.readLine()) != null) {                
                if(message){
                    JOptionPane.showMessageDialog(null, s);                
                }
            }
        }
        p.destroy();
    }
    
    public String nomeDomain(JTextField dirDomain){
        
        String[] splitDomain = dirDomain.getText().split("\\\\");
        
        for(int i=0; i < splitDomain.length; i++){
            if(i == splitDomain.length -1){
                return splitDomain[i];                
            }
        }
        
        return null;
    }
        
    public Document carregarXML(File xml) throws IOException, SAXException, ParserConfigurationException{
        
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse(xml);        
        
        doc.getDocumentElement().normalize();
        
        return doc;        
    }
    
    public void alterarConfigPadrao(File xml, JLabel lblStatus, JLabel lblBkp) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerException {
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean alterou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element firstPersonElement = (Element)firstPersonNode; 
                                
                String att = firstPersonElement.getTextContent();
                
                if(att.contains("-XX:MaxPermSize=")){                    
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[0]);                    
                } else if(att.contains("-client")){
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[1]);
                } else if(att.contains("-Xmx512")){
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[2]);
                }
            }            
        }
        
        if(alterou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) alterado(s) com sucesso!"); 
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi alterado. Verifique se eles existem!");
            lblStatus.setText("");
        }
    }
    
    public void alterarConfigPerson(File xml, JLabel lblStatus, JLabel lblBkp) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerException {
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean alterou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element firstPersonElement = (Element)firstPersonNode; 
                                
                String att = firstPersonElement.getTextContent();
                
                
                for(int i = 0; i < this.modelAlterar.getRowCount(); i++){
                    
                    if(att.contains(this.modelAlterar.getValueAt(i, 0) + "")){
                        firstPersonElement.setTextContent(this.modelAlterar.getValueAt(i, 1) + "");
                        alterou = true;
                    }                    
                }
            }            
        }
        
        if(alterou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) alterado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi alterado. Verifique se eles existem!");
            lblBkp.setText("");
        }
    }
    
    public void criarConfigPadrao(File xml, JLabel lblStatus, JLabel lblBkp) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);
        
        NodeList listOfPersons = doc.getElementsByTagName("java-config");        
        
        boolean criou = false;
        
        for(int i = 0; i < this.modelCriar.getRowCount(); i++){            
            
            if(!existParam(doc, this.modelCriar.getValueAt(i, 0) + "")){                
                Element add = doc.createElement("jvm-options");
                add.appendChild(doc.createTextNode(this.modelCriar.getValueAt(i, 0) + ""));            
                listOfPersons.item(0).appendChild(add);
                criou = true;
            }            
        }
        
        if(criou){
            saveNewXMLFile(doc, xml.getAbsolutePath());  
            lblStatus.setText("Parâmetro(s) criado(s) com sucesso!");     
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi criado.\nVerifique se já existem!");
            lblBkp.setText("");
        }
    }
    
    public void criarConfigPerson(File xml, JLabel lblStatus, JLabel lblBkp) throws TransformerException, IOException, SAXException, ParserConfigurationException{
        
        Document doc = carregarXML(xml);
        
        NodeList listOfPersons = doc.getElementsByTagName("java-config");        
        
        boolean criou = false;
        
        for(int i = 0; i < this.modelCriar.getRowCount(); i++){            
                        
            if(!existParam(doc, this.modelCriar.getValueAt(i, 0) + "")){                
                Element add = doc.createElement("jvm-options");
                add.appendChild(doc.createTextNode(this.modelCriar.getValueAt(i, 0) + ""));            
                listOfPersons.item(0).appendChild(add);    
                criou = true;
            }
        }        
        
        if(criou){
            saveNewXMLFile(doc, xml.getAbsolutePath());  
            lblStatus.setText("Parâmetro(s) criado(s) com sucesso!");            
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi criado.\nVerifique se já existem!");
            lblBkp.setText("");
        }
    }
    
    public void deletarConfigPadrao(File xml, JLabel lblStatus, JLabel lblBkp) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean apagou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element remove = (Element)firstPersonNode; 
                
                String att = remove.getTextContent();
                
                if(att.contains("-XX:NewRatio")){ 
                    remove.getParentNode().removeChild(remove);
                    apagou = true;
                }
            }            
        }
        
        if(apagou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) deletado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("O parâmetro não foi deletado pois não existe!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        }        
    }
    
    public void deletarConfigPerson(File xml, JLabel lblStatus, JLabel lblBkp) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);

        NodeList listElem = doc.getElementsByTagName("jvm-options");
        
        boolean deletou = false; 
        
        for(int i = 0; i < this.modelDeletar.getRowCount(); i++){                    
            
            String chaveTabela = this.modelDeletar.getValueAt(i, 0) + "";

            for(int s = 0; s < listElem.getLength(); s++){

                Node firstElemNode = listElem.item(s);

                if(firstElemNode.getNodeType() == Node.ELEMENT_NODE){

                    Element remove = (Element)firstElemNode;         
                    String text = remove.getTextContent();

                    if(text.contains(chaveTabela.trim())){
                        remove.getParentNode().removeChild(remove);                        
                        deletou = true;
                    }
                }
            }            
        }
        
        if(deletou){
            saveNewXMLFile(doc, xml.getAbsolutePath());
            lblStatus.setText("Parâmetro(s) deletado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi deletado. Verifique se eles existem!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        }
    }
    
    public void saveNewXMLFile(Document doc, String newFile) throws TransformerException{
        
        doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(newFile));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);        
    }
    
    public boolean isPadrao(JRadioButton radioPadrao){
        return radioPadrao.isSelected();
    }
    
    public String[] carregarConfigsPadraoAlterar(){
        
        String [] configs = new String[this.modelAlterar.getRowCount()];
        
        for(int i=0; i < this.modelAlterar.getRowCount(); i++){
            configs[i] = this.modelAlterar.getValueAt(i, 1) + "";            
        }
                
        return configs;
    }
            
    public boolean existParam(Document doc, String param) throws IOException, SAXException, ParserConfigurationException{
        
        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean isParamXm = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element elem = (Element)firstPersonNode; 
                
                String att = elem.getTextContent();
                
                String verifica = "";
                
                String paramXm = param.charAt(0) + "" + param.charAt(1) + "" + param.charAt(2) + "" + param.charAt(3);
                
                if(param.contains("Xmx") || param.contains("Xmn") || param.contains("Xms")){
                    verifica = paramXm;
                    isParamXm = true;
                } else {
                    verifica = param;
                    isParamXm = false;
                }
                                                
                if(att.contains(verifica)){                    
                    return true;
                }
            }            
        }
        return false;
    }
    
}