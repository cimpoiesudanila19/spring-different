//package org.example.сontrollers;
//
//import org.example.models.Worker;
//import org.example.services.WorkerService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/worker")
//public class WorkerResource {
//    private final WorkerService workerService;
//
//    public WorkerResource(WorkerService workerService) {
//        this.workerService = workerService;
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Worker>> getAllWorkers() {
//        List<Worker> workers = workerService.getAllWorkers();
//        return new ResponseEntity<>(workers, HttpStatus.OK);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Worker> getWorkerById(@PathVariable("id") Long id) {
//        Optional<Worker> worker = workerService.getWorkerById(id);
//        if (worker.isPresent()) {
//            return new ResponseEntity<>(worker.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Worker> addEmployee(@RequestBody Worker worker) {
//        Worker newWorker = workerService.addWorker(worker);
//        return new ResponseEntity<>(newWorker, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Worker> updateWorker(@RequestBody Worker worker) {
//        Worker updatedWorker = workerService.updateWorker(worker);
//        if (updatedWorker != null) {
//            return new ResponseEntity<>(updatedWorker, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteWorker(@PathVariable("id") Long id) {
//        workerService.deleteWorker(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
//
//
//
