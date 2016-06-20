package Fonts.Executar;

/**
 *
 * @author vinicius.reif
 */
public class Variable 
{
    int id;
    String key;
    String value;

    public Variable(int id, String key, String value)
    {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    
}
