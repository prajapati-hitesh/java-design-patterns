package com.projects.designpatterns.creational.prototype;

public class PlasticTree extends Tree {

    private final String name;

    public PlasticTree(double mass, double height) {
        super(mass, height);
        this.name = "PlasticTree";
    }

    public String getName() {
        return name;
    }

   /* @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }*/

    @Override
    protected Tree clone() {
        return super.clone();
    }
}
