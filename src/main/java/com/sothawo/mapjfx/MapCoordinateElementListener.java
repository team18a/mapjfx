/*
 Copyright 2015 Peter-Josef Meisch (pj.meisch@sothawo.com)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.sothawo.mapjfx;

import javafx.beans.value.ChangeListener;

import java.util.Objects;

/**
 * Encapsulation of different ChangeListener instances for a MapCoordinateElement object.
 *
 * @author P.J. Meisch (pj.meisch@sothawo.com).
 */
public final class MapCoordinateElementListener {
// ------------------------------ FIELDS ------------------------------

    /** listener for coordinate changes */
    private final ChangeListener<Coordinate> coordinateChangeListener;

    /** listener for visibility changes */
    private final ChangeListener<Boolean> visibileChangeListener;

// --------------------------- CONSTRUCTORS ---------------------------

    /**
     * @param coordinateChangeListener
     *         coordinate change listener
     * @param visibileChangeListener
     *         visibility change listener
     * @throws java.lang.NullPointerException
     *         if either argument is null
     */
    public MapCoordinateElementListener(ChangeListener<Coordinate> coordinateChangeListener,
                                        ChangeListener<Boolean> visibileChangeListener) {
        this.coordinateChangeListener = Objects.requireNonNull(coordinateChangeListener);
        this.visibileChangeListener = Objects.requireNonNull(visibileChangeListener);
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public ChangeListener<Coordinate> getCoordinateChangeListener() {
        return coordinateChangeListener;
    }

    public ChangeListener<Boolean> getVisibileChangeListener() {
        return visibileChangeListener;
    }
}
