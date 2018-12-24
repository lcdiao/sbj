package cn.lcdiao.sbj.repository;

import cn.lcdiao.sbj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA  extends JpaRepository<User,Long> {
}
