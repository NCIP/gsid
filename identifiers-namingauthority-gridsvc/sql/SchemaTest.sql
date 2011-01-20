
--
-- Table structure for table `identifiers`
--
CREATE TABLE IF NOT EXISTS `identifiers` (
  `id` bigint(20) NOT NULL auto_increment,
  `localIdentifier` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `localIdentifier` (`localIdentifier`)
) ENGINE=InnoDB;


--
-- Table structure for table `identifier_keys`
--
CREATE TABLE IF NOT EXISTS `identifier_keys` (
  `id` bigint(20) NOT NULL auto_increment,
  `value_key` varchar(500) NOT NULL,
  `policyIdentifier` varchar(255) default NULL,
  `identifier_id` bigint(20) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `identifier_keys_id` (`identifier_id`),
  KEY `identifier_keys_value_key` (`value_key`),
  CONSTRAINT `FK7CD2BBCAA0100D7C` FOREIGN KEY (`identifier_id`) REFERENCES `identifiers` (`id`)
) ENGINE=InnoDB;


--
-- Table structure for table `identifier_key_values`
--
CREATE TABLE IF NOT EXISTS `identifier_key_values` (
  `identifier_keys_id` bigint(20) NOT NULL,
  `value` varchar(500) default NULL,
  KEY `identifier_key_values_keys_id` (`identifier_keys_id`),
  KEY `identifier_key_values_value` (`value`),
  CONSTRAINT `FKAF2E3858142B76BA` FOREIGN KEY (`identifier_keys_id`) REFERENCES `identifier_keys` (`id`)
) ENGINE=InnoDB;

