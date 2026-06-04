CREATE user 'mahasiswa'@'localhost' identified by 'rahasia';

grant all privileges on jdbc_mhs_service.* to 'mahasiswa'@'localhost';

flush privileges;
