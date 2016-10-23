/*
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium;

import java.util.List;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Configuration {
    private String _path;
    private String _name;
    private List<String> _styles;

    public Configuration() {
        //
    }

    public String getPath() {
        return _path;
    }

    public String getName() {
        return _name;
    }

    public List<String> getStyles() {
        return _styles;
    }

    public void setPath(String path) {
        _path = path;
        if (path != null && path.length() > 0 && path.charAt(path.length() - 1) != '/') {
            _path += "/";
        }
    }

    public void setName(String name) {
        _name = name;
    }

    public void setStyles(List<String> styles) {
        _styles = styles;
    }
}
