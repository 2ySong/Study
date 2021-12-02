# ALL,ANY
SELECT ename, sal, deptno
FROM emp
WHERE sal > ALL (SELECT sal
                 FROM emp
                 WHERE deptno = 30);
#
SELECT ename, sal, deptno
FROM emp
WHERE sal > ANY (SELECT sal
                 FROM emp
                 WHERE deptno = 30)