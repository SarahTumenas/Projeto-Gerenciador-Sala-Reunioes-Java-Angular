package com.github.SarahTumenas.salaReuniaoJavaAngular.repository;


import com.github.SarahTumenas.salaReuniaoJavaAngular.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}