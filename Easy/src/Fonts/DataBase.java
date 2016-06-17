package Fonts;

import Fonts.Executar.Application;
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
    
    //
    

    public DataBase()
    {
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
    
    public void updateIdsAppList()
    {
        int id = 0;
        for(Application app : this.listApps)
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
    
    public int getProxIdAppList()
    {
        return this.listApps.size();
    }
}
