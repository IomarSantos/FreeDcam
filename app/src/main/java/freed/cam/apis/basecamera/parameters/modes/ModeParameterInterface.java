/*
 *
 *     Copyright (C) 2015 Ingo Fuchs
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * /
 */

package freed.cam.apis.basecamera.parameters.modes;

/**
 * Created by troop on 17.08.2014.
 */
public interface ModeParameterInterface
{
    boolean IsSupported();

    void SetValue(String valueToSet, boolean setToCamera);

    String GetValue();

    String[] GetValues();

    boolean IsVisible();

    void addEventListner(AbstractModeParameter.I_ModeParameterEvent eventListner);
    void removeEventListner(AbstractModeParameter.I_ModeParameterEvent parameterEvent);

    void BackgroundValueHasChanged(String value);
    void BackgroundValuesHasChanged(String[] value);
    void BackgroundIsSupportedChanged(boolean value);
    void BackgroundSetIsSupportedHasChanged(boolean value);
    void BackgroundVisibilityChanged(boolean value);

}
