/**
 *
 *   Copyright 2015 sourceforge.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.cleanlogic.olcesium4gwt.showcase.config;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.user.client.ui.Image;
import org.cleanlogic.olcesium4gwt.showcase.config.provider.ShowcaseBrandsProvider;
import org.cleanlogic.olcesium4gwt.showcase.config.provider.ShowcaseLogoProvider;
import org.cleanlogic.olcesium4gwt.showcase.examples.*;
import org.cleanlogic.olcesium4gwt.showcase.puregwt.ShowcaseEventBus;
import org.cleanlogic.olcesium4gwt.showcase.puregwt.ShowcaseEventBusImpl;

import javax.inject.Singleton;
import java.util.List;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class InjectorModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(ShowcaseEventBus.class).to(ShowcaseEventBusImpl.class).in(Singleton.class);

        bind(Image.class).toProvider(ShowcaseLogoProvider.class).in(Singleton.class);
        bind(List.class).toProvider(ShowcaseBrandsProvider.class).in(Singleton.class);

        bind(Vectors.class).asEagerSingleton();
        bind(Exports.class).asEagerSingleton();
    }
}
