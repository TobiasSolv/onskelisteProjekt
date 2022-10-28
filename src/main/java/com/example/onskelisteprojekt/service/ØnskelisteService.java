package com.example.onskelisteprojekt.service;

import com.example.onskelisteprojekt.model.Ønskeliste;
import com.example.onskelisteprojekt.repository.ØnskelisteRepository;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;
import java.util.List;

public class ØnskelisteService {

    ØnskelisteRepository repo = new ØnskelisteRepository();

    public List<Ønskeliste> getØnskeliste(){

        return repo.getØnskelistes();
    }

    public void create(WebRequest req)  {

        Ønskeliste ønskeliste = new Ønskeliste(req.getParameter("wish"));

        repo.create(ønskeliste);
    }


}
