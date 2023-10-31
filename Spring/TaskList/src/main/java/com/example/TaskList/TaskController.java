/**
 * Spiegazione delle annotazioni:
    •@Entity: Indica che una classe è un'entità JPA e viene mappata su una tabella nel database.
    • @Id: Specifica la proprietà dell'entità da utilizzare come chiave primaria.
    • @GeneratedValue: Indica che il valore della chiave primaria deve essere generato automaticamente.
    • @RestController: Indica che la classe è un controller che restituisce dati in formato JSON o XML.
    • @RequestMapping: Mappa un URL di base a una classe o un metodo del controller.
    • @PostMapping: Mappa le richieste HTTP POST a un metodo specifico.
    • @GetMapping: Mappa le richieste HTTP GET a un metodo specifico.
    • @PathVariable: Indica che un parametro del metodo deve essere legato a una variabile del percorso dell'URL.
    • @RequestBody: Indica che un parametro del metodo deve essere legato al corpo della richiesta HTTP.
*/
package com.example.TaskList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();

    // visualizza tutte le task
    @GetMapping
    public List<Task> getAllTask(){
        return tasks;
    }
    // visualizza una task
    @GetMapping("/{id}")
    public void getTask(@PathVariable Long id){
        tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }
    // inserisci una task
    @PostMapping
    public void insertTask(@RequestBody Task task){
        tasks.add(task);
    }
    // elimina una task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        tasks.removeIf(t -> t.getId().equals(id));
    }
}
