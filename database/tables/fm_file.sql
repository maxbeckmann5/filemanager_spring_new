CREATE TABLE IF NOT EXISTS fm_file (
    name VARCHAR(255) NOT NULL,
    file_type VARCHAR(255),
    last_configured DATETIME(6),
    path VARCHAR(255) NOT NULL,
    size BIGINT,
    PRIMARY KEY (name)
);