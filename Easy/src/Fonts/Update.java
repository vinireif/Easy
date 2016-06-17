package Fonts;

import Frames.MainFrame;
import VBUtils.VBThread;

/**
 *
 * @author vinicius.reif
 */
public class Update extends VBThread
{
    private DataBase bd;
    private MainFrame mf;

    public Update(MainFrame aThis, DataBase bd)
    {
        super(1000);
        this.bd = bd;
        this.mf = mf;
    }

    @Override
    public void execute()
    {
        //FIXME Adicionar aqui o que será atualizado automaticamente
    }

}
