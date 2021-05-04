package com.ssafy.mogasup.mapper;

import java.util.HashMap;
import java.util.List;

import com.ssafy.mogasup.dto.Family;

public interface FamilyMapper {
	public void createFamily(String name);
	public int findFamilyId();
	public void createUserFamily(int user_id, int family_id);
	public List<Family> familyList(int user_id);
	public List<HashMap<String, String>> familyMemberList(int family_id);
	public void deleteFamily(int family_id);
	public void deleteFamilyMember(int user_id, int family_id);
}
