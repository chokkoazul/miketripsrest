package com.chokkozul.miketripsrest.repository;

import com.chokkozul.miketripsrest.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberEntity, Long> {

}
