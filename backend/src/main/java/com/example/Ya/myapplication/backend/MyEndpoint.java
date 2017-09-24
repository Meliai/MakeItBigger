/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Ya.myapplication.backend;


import com.example.JokeLib;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Ya.example.com",
                ownerName = "backend.myapplication.Ya.example.com",
                packagePath = ""
        )
)

public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "tellJoke")
    public MyBean putJoke() {
        MyBean data = new MyBean();
        JokeLib jokeLib = new JokeLib();
        data.setMyJoke(jokeLib.getJoke());
        return data;
    }


}
