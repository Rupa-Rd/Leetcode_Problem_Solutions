class Solution:
    def average(self, salary: List[int]) -> float:
        min_salary = min(salary)
        max_salary = max(salary)
        #average = 0
        salary = list(filter((min_salary).__ne__,salary))
        salary = list(filter((max_salary).__ne__,salary))
        average = sum(salary) / len(salary)
        return average
        