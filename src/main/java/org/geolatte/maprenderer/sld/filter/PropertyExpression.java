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

package org.geolatte.maprenderer.sld.filter;

import org.geolatte.common.Feature;

public class PropertyExpression extends Expression<Object, Object> {

    private String propertyName;

    public void setPropertyName(String property) {
        this.propertyName = property;
    }


    public Object evaluate(Feature feature) {
        return feature.getProperty(this.propertyName);
    }

    public int getNumArgs() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void setArg(int i, Expression<Object, ?> arg) {
        //never invoked
    }

    public String toString() {
        return this.propertyName;
    }
}