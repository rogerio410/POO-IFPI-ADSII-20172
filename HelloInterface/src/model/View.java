package model;

public abstract class View {

    private int id;
    private int width;
    private int height;

    private ClickListener clickListener;

    public final void click(){
        if (this.clickListener != null)
            clickListener.action();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ClickListener {

        void action();

    }

}
