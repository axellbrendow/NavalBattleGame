package nbg.drawings;

public class Layer<T>
{
    private T[][] layer;

    public Layer(T[][] layer)
    {
        this.layer = layer;
    }

    public T[][] getLayer()
    {
        return layer;
    }

    public void setLayer(T[][] layer)
    {
        this.layer = layer;
    }

    public void addContent(T content, int x, int y)
    {
    }

    public T removeContent(int x, int y)
    {
        return null;
    }

    public void updateContent(T content, int x, int y)
    {
    }
}
