/*
 */
package org.onebeartoe.web.enabled.pixel.controllers;

import com.sun.net.httpserver.HttpExchange;

/**
 *
 * @author Roberto Marquez
 */
public class IndexHttpHandler extends PixelHttpHandler
{
    @Override
    protected String getHttpText(HttpExchange t)
    {
        String response = "Hello, Pixel Worlds!\n";

        return response;
    }
}
