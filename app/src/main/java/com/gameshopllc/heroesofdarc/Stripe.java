package com.gameshopllc.heroesofdarc;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;

/**
 *
 * @author lyndenjayevans
 */
public class Stripe extends CurrencyMesh {

    ColorRGBA color;

    public Stripe (SimpleApplication app, ColorRGBA color){
        this(app);
        this.color = color;

        this.vertices.clear();

        vertices.add(new ArrayList<Vector3f>());

        vertices.get(0).add(new Vector3f(0,0,0));
        vertices.get(0).add(new Vector3f(12,0,0));
        vertices.get(0).add(new Vector3f(0,.5f,0));
        vertices.get(0).add(new Vector3f(12,.5f,0));

        indexes.add(2);
        indexes.add(0);
        indexes.add(1);
        indexes.add(1);
        indexes.add(3);
        indexes.add(2);


        polys.add(new Poly(app, vertices.get(0), texCoord, indexes, this.color));

    }
    public Stripe(SimpleApplication app) {
        super(app);
    }


}

