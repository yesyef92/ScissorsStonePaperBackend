package com.ys.scissorsstonepaperbackend.repository;

import com.ys.scissorsstonepaperbackend.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
