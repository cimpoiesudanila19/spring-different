//package org.example.сontrollers;
//
//import org.example.models.Article;
//import org.example.repositories.ArticleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.Optional;
//
//@Controller
//public class AlbumController {
//
//    @Autowired
//    private ArticleRepository articleRepository;
//
//    @GetMapping("/album")
//    public String album(Model model) {
//        Iterable<Article> articles = articleRepository.findAll();
//        model.addAttribute("articles", articles);
//        return "album";
//    }
//    @GetMapping("/album/add")
//    public String albumAdd(Model model) {
//        return "album-add";
//    }
//
//    @PostMapping("/album/add")
//    public String albumPostAdd(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text, Model model) {
//        Article article = new Article(title, anons, full_text);
//        articleRepository.save(article);
//        return "redirect:/album";
//    }
//
//    @GetMapping("/album/{id}")
//    public String albumDetails(@PathVariable(value = "id") long id, Model model) {
//        if (!articleRepository.existsById(id)){
//            return "redirect:/album";
//        }
//        Optional<Article> article = articleRepository.findById(id);
//        ArrayList<Article> res = new ArrayList<>();
//        article.ifPresent(res::add);
//        model.addAttribute("article", res);
//        return "album-details";
//    }
//
//    @GetMapping("/album/{id}/edit")
//    public String albumEdit(@PathVariable(value = "id") long id, Model model) {
//        if (!articleRepository.existsById(id)){
//            return "redirect:/album";
//        }
//        Optional<Article> article = articleRepository.findById(id);
//        ArrayList<Article> res = new ArrayList<>();
//        article.ifPresent(res::add);
//        model.addAttribute("article", res);
//        return "album-edit";
//    }
//
//    @PostMapping("/album/{id}/edit")
//    public String albumPostUpdate(@PathVariable(value = "id") long id,@RequestParam String title,@RequestParam String anons,@RequestParam String full_text, Model model) {
//        Article article = articleRepository.findById(id).orElseThrow();
//        article.setTitle(title);
//        article.setAnons(anons);
//        article.setFull_text(full_text);
//        articleRepository.save(article);
//        return "redirect:/album";
//    }
//
//    @PostMapping("/album/{id}/remove")
//    public String albumPostDelete(@PathVariable(value = "id") long id, Model model) {
//        Article article = articleRepository.findById(id).orElseThrow();
//        articleRepository.delete(article);
//        return "redirect:/album";
//    }
//}
