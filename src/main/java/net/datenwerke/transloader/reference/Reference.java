/*
*  transloader
*    
*  This file is part of transloader http://code.google.com/p/transloader/ as part
*  of the java-sandbox https://sourceforge.net/p/dw-sandbox/
*
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package net.datenwerke.transloader.reference;

import net.datenwerke.transloader.except.Assert;

public final class Reference {
    public static final Object NULL = new Object() {
        public String toString() {
            return "null";
        }
    };

    private final ReferenceDescription description;
    private final Object value;

    public Reference(ReferenceDescription description, Object value) {
        Assert.areNotNull(description, value);
        this.description = description;
        this.value = value;
    }

    public ReferenceDescription getDescription() {
        return description;
    }

    public Object getValue() {
        return value;
    }

}
