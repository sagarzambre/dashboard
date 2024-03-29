-- DDL generated by DBeaver
-- WARNING: It may differ from actual native database DDL
CREATE TABLE dashboard.dashboard_data (
	end_year INTEGER NULL,
	citylng DOUBLE NULL,
	citylat DOUBLE NULL,
	intensity INTEGER NULL,
	sector VARCHAR(255) NULL,
	topic VARCHAR(255) NULL,
	insight TEXT(65535) NULL,
	swot TEXT(65535) NULL,
	url VARCHAR(255) NULL,
	region VARCHAR(255) NULL,
	start_year INTEGER NULL,
	impact INTEGER NULL,
	added VARCHAR(50) NULL,
	published VARCHAR(50) NULL,
	city VARCHAR(255) NULL,
	country VARCHAR(255) NULL,
	relevance INTEGER NULL,
	pestle VARCHAR(255) NULL,
	source VARCHAR(255) NULL,
	title VARCHAR(400) NULL,
	likelihood INTEGER NULL,
	id INTEGER NOT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;