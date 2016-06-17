package Fonts.Executar;

/**
 *
 * @author vinicius.reif
 */
public class Application 
{
    private int id;
    private String name;
    private String path;

    public Application(int id, String name, String path)
    {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    @Override
    public String toString()
    {
        return this.getName();
    } 
}
