package io.luminara.quickstart.vertx.web;

import static io.vertx.core.http.HttpHeaders.createOptimized;

public class MediaTypes {

    /**
     * application/json;charset=utf-8 header value
     */
    public static final CharSequence APPLICATION_JSON = createOptimized(
            "application/json;charset=utf-8");
}
