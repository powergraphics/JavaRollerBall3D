package br.ol.rollerball.entity;

import br.ol.ge.Entity;
import br.ol.rollerball.scene.RBScene;
import br.ol.rolllerball.model.BallBody;
import br.ol.rolllerball.model.WallBody;
import java.awt.Graphics2D;

/**
 *
 * @author leonardo
 */
public class Wall extends Entity<RBScene> {
    
    private WallBody model;
    
    public Wall(RBScene scene, int x1, int y1, int x2, int y2) {
        super(scene);
        model = getScene().getModel().addWall("wall", x1, y1, x2, y2);
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics2D g) {
    }
    
}
