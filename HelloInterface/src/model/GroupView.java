package model;

public class GroupView extends View {

    private View[] views;
    int pos = 0;

    public GroupView() {
        this.views = new View[128];
    }

    public void addView(View view){
        this.views[pos++] = view;
    }
}
