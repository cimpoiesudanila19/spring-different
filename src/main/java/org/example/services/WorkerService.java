//package org.example.services;
//
//import org.example.models.Worker;
//import org.example.repositories.WorkerCrudRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class WorkerService {
//    private final WorkerCrudRepository workerCrudRepository;
//
//    public WorkerService(WorkerCrudRepository workerCrudRepository) {
//        this.workerCrudRepository = workerCrudRepository;
//    }
//
//    public List<Worker> getAllWorkers() {
//        return (List<Worker>) workerCrudRepository.findAll();
//    }
//
//    public Optional<Worker> getWorkerById(Long id) {
//        return workerCrudRepository.findById(id);
//    }
//
//    public Worker addWorker(Worker worker) {
//        return workerCrudRepository.save(worker);
//    }
//
//    public Worker updateWorker(Worker worker) {
//        if (workerCrudRepository.existsById(worker.getId())) {
//            return workerCrudRepository.save(worker);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteWorker(Long id) {
//        workerCrudRepository.deleteById(id);
//    }
//}
