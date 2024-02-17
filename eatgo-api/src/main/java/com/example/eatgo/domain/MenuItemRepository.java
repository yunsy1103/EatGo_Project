package com.example.eatgo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem,Long> {
    List<MenuItem> findAllByRestarauntId(Long restarauntid);

}
//레스토랑 ID 기반으로 모든 메뉴 아이템 반환
//jpa 연결 위해 구현부 삭제 후 코드 수정