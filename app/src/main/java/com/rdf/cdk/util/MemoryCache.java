package com.rdf.cdk.util;

import java.util.HashMap;

@Deprecated
public class MemoryCache {
    private static MemoryCache a;
    private HashMap<String, Object> b = new HashMap();

    private MemoryCache() {
    }

    public static MemoryCache getInstance() {
        if (a == null) {
            a = new MemoryCache();
        }
        return a;
    }

    public void clearCache() {
        this.b.clear();
    }

    public Object getValue(String str) {
        return this.b.get(str);
    }

    public Object getValue(String str, Object obj) {
        Object value = getValue(str);
        return value == null ? obj : value;
    }

    public void putValue(String str, Object obj) {
        this.b.put(str, obj);
    }

    public void removeValue(String str) {
        if (this.b.containsKey(str)) {
            this.b.remove(str);
        }
    }
}
