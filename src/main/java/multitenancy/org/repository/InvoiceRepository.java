package multitenancy.org.repository;

import org.springframework.data.repository.CrudRepository;

import multitenancy.org.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
