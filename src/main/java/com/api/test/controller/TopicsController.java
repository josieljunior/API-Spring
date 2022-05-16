package com.api.test.controller;

import com.api.test.dto.TopicoDto;
import com.api.test.modelo.Curso;
import com.api.test.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<TopicoDto> list() {
        Topico topic = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topic, topic, topic));
    }

}
