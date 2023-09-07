class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        counter = 1
        biggest=0
        new=False
        if len(nums)>0:
            biggest=1
            for x in range(len(nums)-1):
            
                if nums[x] == nums[x+1]-1 and not new:
                    
                    counter = 2
                    new = True
                elif nums[x] == nums[x+1]:
                    pass
                elif nums[x] == nums[x+1]-1:
                    counter=counter+1
                else:
                    new = False
                if counter>=biggest:
                    biggest=counter
        return biggest     