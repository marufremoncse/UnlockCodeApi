package com.codingsense.UnlockCodeApi.controller;
import com.codingsense.UnlockCodeApi.exception.ResourceNotFoundException;
import com.codingsense.UnlockCodeApi.model.UnlockCodeQueue;
import com.codingsense.UnlockCodeApi.repository.UnlockCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marufur
 */

@RestController
@RequestMapping("/api/v1")
public class UnlockController {
        
        @Autowired
        private UnlockCodeRepository unlockRepository;

        @PostMapping("/unlock")        
        public Map<String, String> createUnlockCode(@RequestBody UnlockCodeQueue unlockCodeQueue) {
            HashMap<String, String> map = new HashMap<>();
            try {
                unlockRepository.save(unlockCodeQueue);
                map.put("status", "success");
            } catch (Exception e) {
                map.put("status", "fail");
            }           
            
            return map;
        }
}

