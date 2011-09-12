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

package org.geolatte.maprenderer.sld;

/**
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 9/12/11
 */
public class TestPointSymbolizer {

     String xmlPointSymbolizer =
            "<PolygonSymbolizer version=\"1.1.0\"" +
                        "                  xmlns=\"http://www.opengis.net/se\"" +
                        "                  xmlns:ogc=\"http://www.opengis.net/ogc\">" +
                        "<Geometry>\n" +
                         "    <ogc:PropertyName>\ncenterline\n</ogc:PropertyName>\n" +
                        "</Geometry>" +
                        "<Fill>" +
                            "<SvgParameter name=\"fill\">#00FF00</SvgParameter> " +
                            "<SvgParameter name=\"fill-opacity\">0.6</SvgParameter> " +
                        "</Fill>" +
                        "<Displacement>" +
                        "   <DisplacementX>5.0</DisplacementX>" +
                        "   <DisplacementY>10.0</DisplacementY>" +
                        "</Displacement>" +
                        "<Stroke>" +
                        "    <SvgParameter name=\"stroke\">\n#FF0000\n</SvgParameter>\n" +
                        "    <SvgParameter name=\"stroke-width\">1</SvgParameter>" +
                        "    <SvgParameter name=\"stroke-opacity\">1</SvgParameter>" +
                        "</Stroke>" +
                        "<PerpendicularOffset>\n" +
                            "10\n" +
                        "</PerpendicularOffset>"+
             "</PolygonSymbolizer>";

}
