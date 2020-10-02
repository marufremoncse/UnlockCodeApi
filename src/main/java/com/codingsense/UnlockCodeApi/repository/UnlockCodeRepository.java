package com.codingsense.UnlockCodeApi.repository;
import com.codingsense.UnlockCodeApi.model.UnlockCodeQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author marufur
 */
@Repository
public interface UnlockCodeRepository extends JpaRepository<UnlockCodeQueue, Long> {}
