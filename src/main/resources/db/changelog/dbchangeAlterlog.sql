-- liquibase formatted sql

-- changeset YASH:alter-actor-table-add-address
ALTER TABLE actor ADD ADDRESS VARCHAR(255) NULL;
--rollback ALTER TABLE actor DROP COLUMN address; 