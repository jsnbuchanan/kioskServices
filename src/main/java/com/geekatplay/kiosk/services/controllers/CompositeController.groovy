package com.geekatplay.kiosk.services.controllers

import com.geekatplay.kiosk.services.model.Composite
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import java.util.concurrent.atomic.AtomicLong

@Controller
@RequestMapping("/composites")
class CompositeController {

    def final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Composite getComposite(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return new Composite(counter.incrementAndGet(), "Test Composite");
    }

}
