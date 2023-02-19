package com.gameshopllc.heroesofdarc;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;

/**
 *
 * @author lyndenjayevans
 */
public class Star extends CurrencyMesh {

    public Star(SimpleApplication app) {
        super(app);


        this.vertices.clear();

        vertices.add(new ArrayList<Vector3f>());


        vertices.get(0).add(new Vector3f(0,0,0));
        vertices.get(0).add(new Vector3f(4,0,0));
        vertices.get(0).add(new Vector3f(2,4,0));
        vertices.get(0).add(new Vector3f(2,4,0));


        vertices.get(0).add(new Vector3f(0,0,0));
        vertices.get(0).add(new Vector3f(-4,0,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));


        vertices.get(0).add(new Vector3f(2,-4,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));
        vertices.get(0).add(new Vector3f(0,-8,0));
        vertices.get(0).add(new Vector3f(0,-8,0));


        vertices.get(0).add(new Vector3f(6,-4,0));
        vertices.get(0).add(new Vector3f(2,-4,0));
        vertices.get(0).add(new Vector3f(4,-8,0));
        vertices.get(0).add(new Vector3f(4,-8,0));


        vertices.get(0).add(new Vector3f(8,0,0));
        vertices.get(0).add(new Vector3f(4,0,0));
        vertices.get(0).add(new Vector3f(6,-4,0));
        vertices.get(0).add(new Vector3f(6,-4,0));



        vertices.get(0).add(new Vector3f(0,0,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));
        vertices.get(0).add(new Vector3f(4,0,0));
        vertices.get(0).add(new Vector3f(6,-4,0));

        vertices.get(0).add(new Vector3f(-4,-8,0));
        vertices.get(0).add(new Vector3f(0,-8,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));
        vertices.get(0).add(new Vector3f(-2,-4,0));

        vertices.get(0).add(new Vector3f(4,-8,0));
        vertices.get(0).add(new Vector3f(8,-8,0));
        vertices.get(0).add(new Vector3f(6,-4,0));
        vertices.get(0).add(new Vector3f(6,-4,0));

//       vertices.get(0).add(new Vector3f(-2,-4,0));
//       vertices.get(0).add(new Vector3f(-6,-4,0));
//       vertices.get(0).add(new Vector3f(-4,-8,0));
//       vertices.get(0).add(new Vector3f(-4,-8,0));
//
//       vertices.get(0).add(new Vector3f(0,0,0));
//       vertices.get(0).add(new Vector3f(4,0,0));
//       vertices.get(0).add(new Vector3f(2,4,0));
//       vertices.get(0).add(new Vector3f(2,4,0));
//
//
//       vertices.get(0).add(new Vector3f(0,0,0));
//       vertices.get(0).add(new Vector3f(4,0,0));
//       vertices.get(0).add(new Vector3f(2,4,0));
//       vertices.get(0).add(new Vector3f(2,4,0));


        indexes.add(2);
        indexes.add(0);
        indexes.add(1);
        indexes.add(1);
        indexes.add(3);
        indexes.add(2);

        indexes.add(2 + 4);
        indexes.add(0 + 4);
        indexes.add(1 + 4);
        indexes.add(1 + 4);
        indexes.add(3 + 4);
        indexes.add(2 + 4);

        indexes.add(2 + 8);
        indexes.add(0 + 8);
        indexes.add(1 + 8);
        indexes.add(1 + 8);
        indexes.add(3 + 8);
        indexes.add(2 + 8);

        indexes.add(2 + 12);
        indexes.add(0 + 12);
        indexes.add(1 + 12);
        indexes.add(1 + 12);
        indexes.add(3 + 12);
        indexes.add(2 + 12);

        indexes.add(2 + 16);
        indexes.add(0 + 16);
        indexes.add(1 + 16);
        indexes.add(1 + 16);
        indexes.add(3 + 16);
        indexes.add(2 + 16);

        indexes.add(2 + 20);
        indexes.add(0 + 20);
        indexes.add(1 + 20);
        indexes.add(1 + 20);
        indexes.add(3 + 20);
        indexes.add(2 + 20);

        indexes.add(2 + 24);
        indexes.add(0 + 24);
        indexes.add(1 + 24);
        indexes.add(1 + 24);
        indexes.add(3 + 24);
        indexes.add(2 + 24);

        indexes.add(2 + 28);
        indexes.add(0 + 28);
        indexes.add(1 + 28);
        indexes.add(1 + 28);
        indexes.add(3 + 28);
        indexes.add(2 + 28);

        polys.add(new Poly(app, vertices.get(0), texCoord, indexes, ColorRGBA.fromRGBA255(255, 255, 255, 255)));


    }


}

