package com.api.test.controller;

import com.api.test.dto.TopicoDto;
import com.api.test.modelo.Curso;
import com.api.test.modelo.Topico;
import com.api.test.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topics")
    public List<TopicoDto> list() {
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }

}
