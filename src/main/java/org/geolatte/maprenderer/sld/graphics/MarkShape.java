/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Copyright (C) 2010 - 2011 and Ownership of code is shared by:
 *  Qmino bvba - Esperantolaan 4 - 3001 Heverlee  (http://www.qmino.com)
 *  Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.maprenderer.sld.graphics;

import java.awt.*;

/**
 * Determines the shape of a <code>Mark</code>.
 *
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 9/19/11
 */
public abstract class MarkShape {

    private float defaultSize = 6; //For now this is hard-coded

    public float getDefaultSize(){
        return this.defaultSize;
    }

    public Shape toShape(float x, float y) {
        return toShape(x, y, defaultSize);
    }

    public abstract Shape toShape(float x, float y, float size);

    /**
     * Allows subclasses to set the default size of the <code>Mark</code>.
     *
     * @param size
     */
    protected void setDefaultSize(float size){
        this.defaultSize = size;
    }
}
