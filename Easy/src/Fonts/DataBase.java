package Fonts;

import Fonts.Executar.Application;
import Fonts.Executar.Variable;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vinicius.reif
 */
public class DataBase implements Serializable
{
    //Executar
    private ArrayList<Application> listApps = new ArrayList<>();
    private ArrayList<Variable> listVars= new ArrayList<>();
    
    //
    

    public DataBase()
    {
    }

    public ArrayList<Variable> getListVars()
    {
        return listVars;
    }

    public void setListVars(ArrayList<Variable> listVars)
    {
        this.listVars = listVars;
    }

    public ArrayList<Application> getListApps()
    {
        return listApps;
    }

    public void setListApps(ArrayList<Application> listApps)
    {
        this.listApps = listApps;
    }
    
    public Application getApp(int id)
    {
        for(Application app : this.listApps)
        {
            if(app.getId() == id)
            {
                return app;
            }
        }
        return null;
    }
    
    public Variable getVar(int id)
    {
        for(Variable app : this.listVars)
        {
            if(app.getId() == id)
            {
                return app;
            }
        }
        return null;
    }
    
    public void updateIdsAppList()
    {
        int id = 0;
        for(Application app : this.listApps)
        {
            app.setId(id);
            id++;
        }
    }
    
    public void updateIdsVarList()
    {
        int id = 0;
        for(Variable app : this.listVars)
        {
            app.setId(id);
            id++;
        }
    }
    
    public void removeApp(int id)
    {
        for(Application app : this.listApps)
        {
            if(app.getId() == id)
            {
                this.listApps.remove(app);
                return;
            }
        }
    }
    
    public void removeVar(int id)
    {
        for(Variable app : this.listVars)
        {
            if(app.getId() == id)
            {
                this.listApps.remove(app);
                return;
            }
        }
    }
    
    public int getProxIdAppList()
    {
        return this.listApps.size();
    }
    
    public int getProxIdVarList()
    {
        return this.listVars.size();
    }
}
