package com.mvc.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mvc.entity.NonMpOnlineTransaction;

@Repository
public interface NonMpOnlineTransactionRepository extends JpaRepository<NonMpOnlineTransaction, Long> {

	@Query("select nmpo.id as id, nmpo.userId as userId, nmpo.task as task, nmpo.type as type,"
			+ "nmpo.size as size, nmpo.quantity as quantity, nmpo.price as price, nmpo.totalPrice as totalPrice,"
			+ "nmpo.printoutSource as printoutSource, nmpo.laminationQuality as laminationQuality,"
			+ "nmpo.duplicateCardType as duplicateCardType, nmpo.typingWork as typingWork, "
			+ "nmpo.otherDescription as otherDescription, nmpo.transactionMasterId as transactionMasterId "
			+ "from NonMpOnlineTransaction nmpo")
	List<Map<String, Object>> getAll();

}
