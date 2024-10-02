-- Org 테이블에 부서명과 부서코드를 삽입
INSERT INTO ORG (org_code, org_name) VALUES ('AAAA', '그룹웨어');
INSERT INTO ORG (org_code, org_name) VALUES ('AAAB', '정보보안');

-- Member 테이블에 이름과 아이디를 삽입
INSERT INTO MEMBER (mem_id, mem_name) VALUES ('swheo', '허석원');


-- MemberOrgRel 테이블에 아이디, 부서코드, 직무명을 삽입
INSERT INTO MEMBER_ORG_REL (mem_id, org_code, job_name) VALUES ('swheo', 'AAAA', '대리');
INSERT INTO MEMBER_ORG_REL (mem_id, org_code, job_name) VALUES ('swheo', 'AAAB', '대리');