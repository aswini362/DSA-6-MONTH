# DSA Preparation Roadmap for 20 LPA Mid-Sized Startup Roles

This roadmap is designed for a Java developer with 3 years of experience targeting **mid-sized startup interviews** in India (e.g., Zoho, Freshworks, Paytm, Swiggy, Razorpay) aiming for a **20 LPA package** (approximately $24,000 USD annually). It aligns with a **5-hour daily study schedule** (5:45 AM - 8:00 AM for 2h15m, 6:45 PM - 9:30 PM for 2h45m, totaling 35 hours/week) over **6 months (26 weeks, 910 hours)** for core mastery, with an optional 2-month extension for advanced topics. The plan leverages your strong Java fundamentals (OOP, Collections, Streams) and project experience (e.g., email management systems using HashSet for deduplication).

## Assumptions
- **Work Hours**: 9 AM to 6 PM, with ~1-hour commute each way.
- **Study Time**: 5 hours/day (split between morning and evening), with 7-8 hours/day on weekends.
- **Goal**: Achieve DSA proficiency for SDE-2 or equivalent roles at mid-sized startups offering 15-25 LPA.
- **Prior Knowledge**: Strong Java skills, experience with backend projects (e.g., email processing).
- **Target Companies**: Mid-sized startups (50-500 employees) prioritizing practical DSA skills (arrays, strings, linked lists, trees, heaps, graphs, hashing, sorting, searching, greedy, DP, sliding window) for backend roles (REST APIs, microservices).

## DSA Preparation Resources

Below is a curated list of resources to complement the 350-problem LeetCode list and your 5-hour daily study schedule.

| Resource | Purpose | Link |
|----------|---------|------|
| LeetCode | Primary platform for problem practice. Use the "Study Plan" feature to follow structured problem sets tailored for interviews. | [leetcode.com](https://leetcode.com) |
| NeetCode | Curated list of important problems by topic, ideal for focused practice on startup-relevant DSA topics like arrays, trees, and graphs. | [neetcode.io/practice](https://neetcode.io/practice) |
| GeeksforGeeks | Excellent tutorials and explanations for DSA concepts, with Java-specific implementations to strengthen coding skills. | [geeksforgeeks.org](https://geeksforgeeks.org) |
| Striver's SDE Sheet | A famous list of ~180 core problems to crack interviews at top companies, including startups like Zoho and Freshworks. | [Search on Google](https://www.google.com/search?q=Striver%27s+SDE+Sheet) |
| Pramp | Free platform for peer-to-peer mock interviews to simulate startup interview scenarios and improve communication. | [pramp.com](https://pramp.com) |

### How to Use These Resources
- **LeetCode**: Solve 5-7 problems daily from the 350-problem list, using the "Study Plan" to track progress.
- **NeetCode**: Prioritize problems overlapping with the provided list for efficient preparation.
- **GeeksforGeeks**: Refer to tutorials for theory (e.g., graph traversal, dynamic programming) before coding.
- **Striver's SDE Sheet**: Supplement with these problems if you complete the 350-problem list early.
- **Pramp**: Schedule 10-12 mock interviews by Month 6 to practice explaining solutions aloud.

## 6-8 Month DSA Roadmap

This roadmap covers **350 LeetCode problems** (120 Easy, 170 Medium, 60 Hard) over 6 months, with an optional 2-month extension for advanced topics. Each month targets ~60 problems (5-7/day), with revisited problems to reinforce concepts. The plan focuses on startup-relevant topics (arrays, strings, linked lists, trees, heaps, graphs, hashing, sorting, searching, greedy, DP, sliding window) and excludes advanced topics (segment trees, DSU) less common in startup interviews.

### Month 1: Foundations and dsa Data Structures (60 Problems, 140 Hours)
**Goal**: Master arrays, strings, and linked lists, foundational for startup interviews.

- **Week 1: Java Revision and Complexity Analysis (10 Problems, Easy)**
  - **Topics**: Advanced Java (`ArrayList`, `LinkedList`, `HashMap`, `HashSet`, `PriorityQueue`, Streams, Generics), Big-O notation (O(1), O(n), O(n²), O(log n)).
  - **Problems**:
    - #1: Two Sum (Easy, Array, HashMap)
    - #217: Contains Duplicate (Easy, Array, HashSet)
    - #242: Valid Anagram (Easy, String, HashMap)
    - #136: Single Number (Easy, Array, Bit Manipulation)
    - #283: Move Zeroes (Easy, Array, Two-Pointer)
    - #350: Intersection of Two Arrays II (Easy, Array, HashMap)
    - #344: Reverse String (Easy, String)
    - #412: Fizz Buzz (Easy, Array)
    - #26: Remove Duplicates from Sorted Array (Easy, Array, Two-Pointer)
    - #66: Plus One (Easy, Array)
  - **Milestone**: Understand complexity, solve 10 problems, optimize 2-3 small Java programs (e.g., array rotation).

- **Weeks 2-4: Arrays, Strings, Linked Lists (50 Problems)**
  - **Arrays (20 Problems)**:
    - #121: Best Time to Buy and Sell Stock (Easy, Array)
    - #88: Merge Sorted Array (Easy, Array, Two-Pointer)
    - #189: Rotate Array (Medium, Array)
    - #238: Product of Array Except Self (Medium, Array)
    - #15: 3Sum (Medium, Array, Two-Pointer)
    - #75: Sort Colors (Medium, Array, Sorting)
    - #48: Rotate Image (Medium, Array, Matrix)
    - #54: Spiral Matrix (Medium, Array, Matrix)
    - #73: Set Matrix Zeroes (Medium, Array, Matrix)
    - #268: Missing Number (Easy, Array)
    - #448: Find All Numbers Disappeared in an Array (Easy, Array)
    - #118: Pascal’s Triangle (Easy, Array)
    - #119: Pascal’s Triangle II (Easy, Array)
    - #169: Majority Element (Easy, Array)
    - #498: Diagonal Traverse (Medium, Array, Matrix)
    - #27: Remove Element (Easy, Array, Two-Pointer)
    - #167: Two Sum II - Input Array Is Sorted (Easy, Array, Two-Pointer)
    - #414: Third Maximum Number (Easy, Array)
    - #561: Array Partition (Easy, Array)
    - #16: 3Sum Closest (Medium, Array, Two-Pointer)
  - **Strings (20 Problems)**:
    - #125: Valid Palindrome (Easy, String)
    - #392: Is Subsequence (Easy, String, Two-Pointer)
    - #28: Find the Index of the First Occurrence in a String (Easy, String)
    - #680: Valid Palindrome II (Easy, String)
    - #205: Isomorphic Strings (Easy, String, HashMap)
    - #49: Group Anagrams (Medium, String, HashMap)
    - #3: Longest Substring Without Repeating Characters (Medium, String, Sliding Window)
    - #424: Longest Repeating Character Replacement (Medium, String, Sliding Window)
    - #5: Longest Palindromic Substring (Medium, String)
    - #647: Palindromic Substrings (Medium, String)
    - #438: Find All Anagrams in a String (Medium, String, Sliding Window)
    - #567: Permutation in String (Medium, String, Sliding Window)
    - #14: Longest Common Prefix (Easy, String)
    - #58: Length of Last Word (Easy, String)
    - #76: Minimum Window Substring (Hard, String, Sliding Window)
    - #13: Roman to Integer (Easy, String)
    - #67: Add Binary (Easy, String)
    - #387: First Unique Character in a String (Easy, String, HashMap)
    - #383: Ransom Note (Easy, String, HashMap)
    - #409: Longest Palindrome (Easy, String, HashMap)
  - **Linked Lists (10 Problems)**:
    - #206: Reverse Linked List (Easy, Linked List)
    - #21: Merge Two Sorted Lists (Easy, Linked List)
    - #141: Linked List Cycle (Easy, Linked List, Two-Pointer)
    - #234: Palindrome Linked List (Easy, Linked List)
    - #83: Remove Duplicates from Sorted List (Easy, Linked List)
    - #19: Remove Nth Node From End of List (Medium, Linked List)
    - #445: Add Two Numbers II (Medium, Linked List)
    - #86: Partition List (Medium, Linked List)
    - #61: Rotate List (Medium, Linked List)
    - #142: Linked List Cycle II (Medium, Linked List)
  - **Milestone**: Implement arrays, strings, and linked lists from scratch, solve 50 problems.

### Month 2: Stacks, Queues, and dsa Algorithms (60 Problems, 140 Hours)
**Goal**: Master stacks, queues, and core algorithms (sorting, searching) for startup problems.

- **Weeks 1-2: Stacks and Queues (25 Problems)**
  - **Stacks (13 Problems)**:
    - #20: Valid Parentheses (Easy, Stack)
    - #155: Min Stack (Medium, Stack)
    - #225: Implement Stack using Queues (Easy, Stack)
    - #682: Baseball Game (Easy, Stack)
    - #739: Daily Temperatures (Medium, Stack)
    - #496: Next Greater Element I (Easy, Stack)
    - #503: Next Greater Element II (Medium, Stack)
    - #394: Decode String (Medium, Stack)
    - #735: Asteroid Collision (Medium, Stack)
    - #901: Online Stock Span (Medium, Stack)
    - #844: Backspace String Compare (Easy, Stack)
    - #150: Evaluate Reverse Polish Notation (Medium, Stack)
    - #853: Car Fleet (Medium, Stack)
  - **Queues (12 Problems)**:
    - #232: Implement Queue using Stacks (Easy, Queue)
    - #346: Moving Average from Data Stream (Easy, Queue)
    - #933: Number of Recent Calls (Easy, Queue)
    - #622: Design Circular Queue (Medium, Queue)
    - #641: Design Circular Deque (Medium, Queue)
    - #239: Sliding Window Maximum (Hard, Queue, Deque)
    - #2073: Time Needed to Buy Tickets (Easy, Queue)
    - #1700: Number of Students Unable to Eat Lunch (Easy, Queue)
    - #862: Shortest Subarray with Sum at Least K (Hard, Queue)
    - #225: Implement Stack using Queues (Easy, Queue, revisit)
    - #232: Implement Queue using Stacks (Easy, Queue, revisit)
    - #496: Next Greater Element I (Easy, Stack, revisit)
  - **Milestone**: Implement stacks and queues, solve 25 problems.

- **Weeks 3-4: Sorting, Searching, Recursion (35 Problems)**
  - **Sorting (10 Problems)**:
    - #912: Sort an Array (Medium, Sorting)
    - #215: Kth Largest Element in an Array (Medium, Quick Sort/Heap)
    - #56: Merge Intervals (Medium, Sorting)
    - #75: Sort Colors (Medium, Sorting)
    - #148: Sort List (Medium, Linked List, Merge Sort)
    - #179: Largest Number (Medium, Sorting)
    - #252: Meeting Rooms (Easy, Sorting)
    - #253: Meeting Rooms II (Medium, Sorting, Heap)
    - #88: Merge Sorted Array (Easy, Sorting, revisit)
    - #164: Maximum Gap (Hard, Sorting)
  - **Searching (12 Problems)**:
    - #704: Binary Search (Easy, Binary Search)
    - #33: Search in Rotated Sorted Array (Medium, Binary Search)
    - #74: Search a 2D Matrix (Medium, Binary Search)
    - #81: Search in Rotated Sorted Array II (Medium, Binary Search)
    - #153: Find Minimum in Rotated Sorted Array (Medium, Binary Search)
    - #278: First Bad Version (Easy, Binary Search)
    - #374: Guess Number Higher or Lower (Easy, Binary Search)
    - #875: Koko Eating Bananas (Medium, Binary Search)
    - #1011: Capacity To Ship Packages Within D Days (Medium, Binary Search)
    - #4: Median of Two Sorted Arrays (Hard, Binary Search)
    - #240: Search a 2D Matrix II (Medium, Divide & Conquer)
    - #33: Search in Rotated Sorted Array (Medium, Binary Search, revisit)
  - **Recursion (13 Problems)**:
    - #509: Fibonacci Number (Easy, Recursion)
    - #118: Pascal’s Triangle (Easy, Recursion)
    - #1137: N-th Tribonacci Number (Easy, Recursion)
    - #206: Reverse Linked List (Easy, Recursion, revisit)
    - #21: Merge Two Sorted Lists (Easy, Recursion, revisit)
    - #50: Pow(x, n) (Medium, Recursion)
    - #39: Combination Sum (Medium, Recursion, Backtracking)
    - #40: Combination Sum II (Medium, Recursion, Backtracking)
    - #77: Combinations (Medium, Recursion, Backtracking)
    - #46: Permutations (Medium, Recursion, Backtracking)
    - #108: Convert Sorted Array to Binary Search Tree (Easy, Divide & Conquer, revisit)
    - #39: Combination Sum (Medium, Recursion, Backtracking, revisit)
    - #40: Combination Sum II (Medium, Recursion, Backtracking, revisit)
  - **Milestone**: Implement sorting algorithms, binary search, and recursion, solve 35 problems.

### Month 3: Intermediate Data Structures - Trees and Heaps (60 Problems, 140 Hours)
**Goal**: Master trees and heaps, critical for startup system design problems.

- **Weeks 1-2: Trees (30 Problems)**
  - #226: Invert Binary Tree (Easy, Binary Tree)
  - #104: Maximum Depth of Binary Tree (Easy, Binary Tree)
  - #100: Same Tree (Easy, Binary Tree)
  - #108: Convert Sorted Array to Binary Search Tree (Easy, BST)
  - #98: Validate Binary Search Tree (Medium, BST)
  - #101: Symmetric Tree (Easy, Binary Tree)
  - #112: Path Sum (Easy, Binary Tree)
  - #110: Balanced Binary Tree (Easy, Binary Tree)
  - #111: Minimum Depth of Binary Tree (Easy, Binary Tree)
  - #235: Lowest Common Ancestor of a Binary Search Tree (Easy, BST)
  - #236: Lowest Common Ancestor of a Binary Tree (Medium, Binary Tree)
  - #102: Binary Tree Level Order Traversal (Medium, Binary Tree)
  - #103: Binary Tree Zigzag Level Order Traversal (Medium, Binary Tree)
  - #199: Binary Tree Right Side View (Medium, Binary Tree)
  - #113: Path Sum II (Medium, Binary Tree)
  - #129: Sum Root to Leaf Numbers (Medium, Binary Tree)
  - #124: Binary Tree Maximum Path Sum (Hard, Binary Tree)
  - #105: Construct Binary Tree from Preorder and Inorder Traversal (Medium, Binary Tree)
  - #106: Construct Binary Tree from Inorder and Postorder Traversal (Medium, Binary Tree)
  - #114: Flatten Binary Tree to Linked List (Medium, Binary Tree)
  - #99: Recover Binary Search Tree (Hard, BST)
  - #450: Delete Node in a BST (Medium, BST)
  - #230: Kth Smallest Element in a BST (Medium, BST)
  - #173: Binary Search Tree Iterator (Medium, BST)
  - #297: Serialize and Deserialize Binary Tree (Hard, Binary Tree)
  - #94: Binary Tree Inorder Traversal (Easy, Binary Tree)
  - #144: Binary Tree Preorder Traversal (Easy, Binary Tree)
  - #145: Binary Tree Postorder Traversal (Easy, Binary Tree)
  - #543: Diameter of Binary Tree (Easy, Binary Tree)
  - #572: Subtree of Another Tree (Easy, Binary Tree)
  - **Milestone**: Implement BST and tree traversals, solve 30 problems.

- **Weeks 3-4: Heaps (30 Problems)**
  - #215: Kth Largest Element in an Array (Medium, Heap)
  - #703: Kth Largest Element in a Stream (Easy, Heap)
  - #347: Top K Frequent Elements (Medium, Heap, HashMap)
  - #295: Find Median from Data Stream (Hard, Heap)
  - #378: Kth Smallest Element in a Sorted Matrix (Medium, Heap)
  - #692: Top K Frequent Words (Medium, Heap)
  - #355: Design Twitter (Medium, Heap)
  - #451: Sort Characters By Frequency (Medium, Heap)
  - #373: Find K Pairs with Smallest Sums (Medium, Heap)
  - #264: Ugly Number II (Medium, Heap)
  - #313: Super Ugly Number (Medium, Heap)
  - #407: Trapping Rain Water II (Hard, Heap)
  - #502: IPO (Hard, Heap)
  - #632: Smallest Range Covering Elements from K Lists (Hard, Heap)
  - #767: Reorganize String (Medium, Heap)
  - #857: Minimum Cost to Hire K Workers (Hard, Heap)
  - #871: Minimum Number of Refueling Stops (Hard, Heap)
  - #973: K Closest Points to Origin (Medium, Heap)
  - #1046: Last Stone Weight (Easy, Heap)
  - #1337: The K Weakest Rows in a Matrix (Easy, Heap)
  - #1383: Maximum Performance of a Team (Hard, Heap)
  - #1642: Furthest Building You Can Reach (Medium, Heap)
  - #1834: Single-Threaded CPU (Medium, Heap)
  - #218: The Skyline Problem (Hard, Heap)
  - #253: Meeting Rooms II (Medium, Heap, revisit)
  - #1046: Last Stone Weight (Easy, Heap, revisit)
  - #506: Relative Ranks (Easy, Heap)
  - #692: Top K Frequent Words (Medium, Heap, revisit)
  - #973: K Closest Points to Origin (Medium, Heap, revisit)
  - #480: Sliding Window Median (Hard, Heap)
  - **Milestone**: Implement heaps, solve 30 problems.

### Month 4: Intermediate Data Structures - Graphs and Hashing (55 Problems, 140 Hours)
**Goal**: Master graphs and hashing for system scalability and data processing.

- **Weeks 1-2: Graphs (28 Problems)**
  - #200: Number of Islands (Medium, Graph, DFS/BFS)
  - #695: Max Area of Island (Medium, Graph, DFS)
  - #994: Rotting Oranges (Medium, Graph, BFS)
  - #207: Course Schedule (Medium, Graph, Topological Sort)
  - #733: Flood Fill (Easy, Graph, DFS/BFS)
  - #210: Course Schedule II (Medium, Graph, Topological Sort)
  - #417: Pacific Atlantic Water Flow (Medium, Graph, DFS/BFS)
  - #547: Number of Provinces (Medium, Graph, DFS/BFS)
  - #743: Network Delay Time (Medium, Graph, Dijkstra’s)
  - #787: Cheapest Flights Within K Stops (Medium, Graph, Dijkstra’s/Bellman-Ford)
  - #332: Reconstruct Itinerary (Medium, Graph, DFS)
  - #127: Word Ladder (Hard, Graph, BFS)
  - #126: Word Ladder II (Hard, Graph, BFS)
  - #785: Is Graph Bipartite? (Medium, Graph, DFS/BFS)
  - #886: Possible Bipartition (Medium, Graph, DFS/BFS)
  - #797: All Paths From Source to Target (Medium, Graph, DFS)
  - #841: Keys and Rooms (Medium, Graph, DFS/BFS)
  - #1971: Find if Path Exists in Graph (Easy, Graph, DFS/BFS)
  - #1462: Course Schedule IV (Medium, Graph, DFS)
  - #399: Evaluate Division (Medium, Graph, DFS)
  - #684: Redundant Connection (Medium, Graph, Union-Find)
  - #323: Number of Connected Components in an Undirected Graph (Medium, Graph, DFS)
  - #261: Graph Valid Tree (Medium, Graph, DFS/Union-Find)
  - #990: Satisfiability of Equality Equations (Medium, Graph, Union-Find)
  - #1319: Number of Operations to Make Network Connected (Medium, Graph, Union-Find)
  - #1971: Find if Path Exists in Graph (Easy, Graph, DFS/BFS, revisit)
  - #547: Number of Provinces (Medium, Graph, DFS/BFS, revisit)
  - #417: Pacific Atlantic Water Flow (Medium, Graph, DFS/BFS, revisit)
  - **Milestone**: Implement BFS/DFS, solve 28 problems.

- **Weeks 3-4: Hashing (27 Problems)**
  - #49: Group Anagrams (Medium, HashMap)
  - #1: Two Sum (Easy, HashMap)
  - #560: Subarray Sum Equals K (Medium, HashMap)
  - #219: Contains Duplicate II (Easy, HashMap)
  - #205: Isomorphic Strings (Easy, HashMap)
  - #146: LRU Cache (Medium, HashMap, Linked List)
  - #454: 4Sum II (Medium, HashMap)
  - #525: Contiguous Array (Medium, HashMap)
  - #128: Longest Consecutive Sequence (Medium, HashMap)
  - #594: Longest Harmonious Subsequence (Easy, HashMap)
  - #599: Minimum Index Sum of Two Lists (Easy, HashMap)
  - #706: Design HashMap (Easy, HashMap)
  - #705: Design HashSet (Easy, HashMap)
  - #974: Subarray Sums Divisible by K (Medium, HashMap)
  - #981: Time Based Key-Value Store (Medium, HashMap)
  - #159: Longest Substring with At Most Two Distinct Characters (Medium, HashMap)
  - #340: Longest Substring with At Most K Distinct Characters (Hard, HashMap)
  - #992: Subarrays with K Different Integers (Hard, HashMap)
  - #930: Binary Subarrays With Sum (Medium, HashMap)
  - #904: Fruit Into Baskets (Medium, HashMap)
  - #697: Degree of an Array (Easy, HashMap)
  - #811: Subdomain Visit Count (Easy, HashMap)
  - #953: Verifying an Alien Dictionary (Easy, HashMap)
  - #1152: Analyze User Website Visit Pattern (Medium, HashMap)
  - #76: Minimum Window Substring (Hard, HashMap, revisit)
  - #706: Design HashMap (Easy, HashMap, revisit)
  - #904: Fruit Into Baskets (Medium, HashMap, revisit)
  - **Milestone**: Implement hash-based solutions, solve 27 problems.

### Month 5: Intermediate Algorithms (55 Problems, 175 Hours)
**Goal**: Master greedy, divide & conquer, DP, and sliding window for complex problems.

- **Weeks 1-2: Greedy and Divide & Conquer (22 Problems)**
  - **Greedy (12 Problems)**:
    - #55: Jump Game (Medium, Greedy)
    - #45: Jump Game II (Medium, Greedy)
    - #134: Gas Station (Medium, Greedy)
    - #406: Queue Reconstruction by Height (Medium, Greedy)
    - #763: Partition Labels (Medium, Greedy)
    - #435: Non-overlapping Intervals (Medium, Greedy)
    - #452: Minimum Number of Arrows to Burst Balloons (Medium, Greedy)
    - #605: Can Place Flowers (Easy, Greedy)
    - #665: Non-decreasing Array (Easy, Greedy)
    - #860: Lemonade Change (Easy, Greedy)
    - #55: Jump Game (Medium, Greedy, revisit)
    - #45: Jump Game II (Medium, Greedy, revisit)
  - **Divide & Conquer (10 Problems)**:
    - #169: Majority Element (Easy, Divide & Conquer)
    - #241: Different Ways to Add Parentheses (Medium, Divide & Conquer)
    - #215: Kth Largest Element in an Array (Medium, Divide & Conquer, revisit)
    - #148: Sort List (Medium, Divide & Conquer, revisit)
    - #53: Maximum Subarray (Medium, Divide & Conquer)
    - #240: Search a 2D Matrix II (Medium, Divide & Conquer)
    - #95: Unique Binary Search Trees II (Medium, Divide & Conquer)
    - #108: Convert Sorted Array to Binary Search Tree (Easy, Divide & Conquer, revisit)
    - #4: Median of Two Sorted Arrays (Hard, Divide & Conquer, revisit)
    - #312: Burst Balloons (Hard, Divide & Conquer)
  - **Milestone**: Implement greedy and divide & conquer algorithms, solve 22 problems.

- **Weeks 3-5: Dynamic Programming and Sliding Window (33 Problems)**
  - **Dynamic Programming (17 Problems)**:
    - #70: Climbing Stairs (Easy, DP)
    - #198: House Robber (Medium, DP)
    - #213: House Robber II (Medium, DP)
    - #300: Longest Increasing Subsequence (Medium, DP)
    - #1143: Longest Common Subsequence (Medium, DP)
    - #322: Coin Change (Medium, DP)
    - #377: Combination Sum IV (Medium, DP)
    - #416: Partition Equal Subset Sum (Medium, DP)
    - #518: Coin Change II (Medium, DP)
    - #139: Word Break (Medium, DP)
    - #5: Longest Palindromic Substring (Medium, DP, revisit)
    - #647: Palindromic Substrings (Medium, DP, revisit)
    - #62: Unique Paths (Medium, DP)
    - #63: Unique Paths II (Medium, DP)
    - #64: Minimum Path Sum (Medium, DP)
    - #746: Min Cost Climbing Stairs (Easy, DP)
    - #377: Combination Sum IV (Medium, DP, revisit)
  - **Sliding Window (16 Problems)**:
    - #3: Longest Substring Without Repeating Characters (Medium, Sliding Window)
    - #424: Longest Repeating Character Replacement (Medium, Sliding Window)
    - #209: Minimum Size Subarray Sum (Medium, Sliding Window)
    - #76: Minimum Window Substring (Hard, Sliding Window)
    - #438: Find All Anagrams in a String (Medium, Sliding Window, revisit)
    - #567: Permutation in String (Medium, Sliding Window, revisit)
    - #904: Fruit Into Baskets (Medium, Sliding Window, revisit)
    - #159: Longest Substring with At Most Two Distinct Characters (Medium, Sliding Window)
    - #340: Longest Substring with At Most K Distinct Characters (Hard, Sliding Window)
    - #992: Subarrays with K Different Integers (Hard, Sliding Window)
    - #995: Minimum Number of K Consecutive Bit Flips (Hard, Sliding Window)
    - #1004: Max Consecutive Ones III (Medium, Sliding Window)
    - #1493: Longest Subarray of 1’s After Deleting One Element (Medium, Sliding Window)
    - #239: Sliding Window Maximum (Hard, Sliding Window, revisit)
    - #930: Binary Subarrays With Sum (Medium, Sliding Window, revisit)
    - #1358: Number of Substrings Containing All Three Characters (Medium, Sliding Window)
  - **Milestone**: Implement DP and sliding window solutions, solve 33 problems.

### Month 6: Mock Interviews and Consolidation (60 Problems, 175 Hours)
**Goal**: Prepare for startup interviews with timed practice and company-specific problems.

- **Company-Specific (60 Problems)**:
  - #146: LRU Cache (Medium, HashMap, Linked List)
  - #238: Product of Array Except Self (Medium, Array)
  - #15: 3Sum (Medium, Array, Two-Pointer)
  - #208: Implement Trie (Medium, Trie)
  - #253: Meeting Rooms II (Medium, Heap, Sorting)
  - #236: Lowest Common Ancestor of a Binary Tree (Medium, Tree)
  - #121: Best Time to Buy and Sell Stock (Easy, Array)
  - #42: Trapping Rain Water (Hard, Two-Pointer, Stack)
  - #23: Merge K Sorted Lists (Hard, Linked List, Heap)
  - #124: Binary Tree Maximum Path Sum (Hard, Tree)
  - #49: Group Anagrams (Medium, HashMap, revisit)
  - #1: Two Sum (Easy, HashMap, revisit)
  - #215: Kth Largest Element in an Array (Medium, Heap, revisit)
  - #206: Reverse Linked List (Easy, Linked List, revisit)
  - #21: Merge Two Sorted Lists (Easy, Linked List, revisit)
  - #200: Number of Islands (Medium, Graph, DFS/BFS, revisit)
  - #207: Course Schedule (Medium, Graph, Topological Sort, revisit)
  - #56: Merge Intervals (Medium, Sorting, revisit)
  - #3: Longest Substring Without Repeating Characters (Medium, Sliding Window, revisit)
  - #76: Minimum Window Substring (Hard, Sliding Window, revisit)
  - #70: Climbing Stairs (Easy, DP, revisit)
  - #198: House Robber (Medium, DP, revisit)
  - #300: Longest Increasing Subsequence (Medium, DP, revisit)
  - #704: Binary Search (Easy, Binary Search, revisit)
  - #33: Search in Rotated Sorted Array (Medium, Binary Search, revisit)
  - #20: Valid Parentheses (Easy, Stack, revisit)
  - #155: Min Stack (Medium, Stack, revisit)
  - #104: Maximum Depth of Binary Tree (Easy, Tree, revisit)
  - #98: Validate Binary Search Tree (Medium, BST, revisit)
  - #347: Top K Frequent Elements (Medium, Heap, HashMap, revisit)
  - #141: Linked List Cycle (Easy, Linked List, revisit)
  - #234: Palindrome Linked List (Easy, Linked List, revisit)
  - #125: Valid Palindrome (Easy, String, revisit)
  - #392: Is Subsequence (Easy, String, revisit)
  - #55: Jump Game (Medium, Greedy, revisit)
  - #45: Jump Game II (Medium, Greedy, revisit)
  - #134: Gas Station (Medium, Greedy, revisit)
  - #169: Majority Element (Easy, Divide & Conquer, revisit)
  - #53: Maximum Subarray (Medium, Divide & Conquer, revisit)
  - #5: Longest Palindromic Substring (Medium, DP, revisit)
  - #139: Word Break (Medium, DP, revisit)
  - #424: Longest Repeating Character Replacement (Medium, Sliding Window, revisit)
  - #209: Minimum Size Subarray Sum (Medium, Sliding Window, revisit)
  - #560: Subarray Sum Equals K (Medium, HashMap, revisit)
  - #128: Longest Consecutive Sequence (Medium, HashMap, revisit)
  - #102: Binary Tree Level Order Traversal (Medium, Tree, revisit)
  - #103: Binary Tree Zigzag Level Order Traversal (Medium, Tree, revisit)
  - #695: Max Area of Island (Medium, Graph, DFS, revisit)
  - #994: Rotting Oranges (Medium, Graph, BFS, revisit)
  - #297: Serialize and Deserialize Binary Tree (Hard, Tree, revisit)
  - #16: 3Sum Closest (Medium, Array, Two-Pointer)
  - #409: Longest Palindrome (Easy, String, HashMap)
  - #237: Delete Node in a Linked List (Easy, Linked List)
  - #160: Intersection of Two Linked Lists (Easy, Linked List)
  - #203: Remove Linked List Elements (Easy, Linked List)
  - #328: Odd Even Linked List (Medium, Linked List)
  - #82: Remove Duplicates from Sorted List II (Medium, Linked List)
  - #117: Populating Next Right Pointers in Each Node II (Medium, Binary Tree)
  - #652: Find Duplicate Subtrees (Medium, Binary Tree)
  - #1358: Number of Substrings Containing All Three Characters (Medium, Sliding Window)
  - **Milestone**: Solve 60 problems, complete 10-12 mock interviews, confidently explain solutions.

### Months 7-8: Advanced Topics (Optional, 8 Weeks, 280 Hours)
**Goal**: Master advanced DSA for top-tier startups or competitive programming.

- **Weeks 1-4: Advanced Graphs and Tries (140 Hours, 60 Problems)**
  - **Graphs (45 Problems)**:
    - #127: Word Ladder (Hard, Graph, BFS)
    - #210: Course Schedule II (Medium, Graph, Topological Sort, revisit)
    - #743: Network Delay Time (Medium, Graph, Dijkstra’s, revisit)
    - #787: Cheapest Flights Within K Stops (Medium, Graph, Dijkstra’s/Bellman-Ford, revisit)
    - #332: Reconstruct Itinerary (Medium, Graph, DFS, revisit)
    - And 40 more problems from LeetCode’s “Graph” tag (e.g., Kruskal’s, Prim’s).
  - **Tries (15 Problems)**:
    - #208: Implement Trie (Medium, Trie)
    - #212: Word Search II (Hard, Trie, DFS)
    - #648: Replace Words (Medium, Trie)
    - And 12 more problems from LeetCode’s “Trie” tag.
  - **Milestone**: Implement advanced graph algorithms and tries, solve 60 problems.

- **Weeks 5-8: Segment Trees, DSU, Bit Manipulation (140 Hours, 60 Problems)**
  - **Segment Trees/Fenwick Trees (20 Problems)**:
    - #307: Range Sum Query - Mutable (Medium, Segment Tree)
    - #315: Count of Smaller Numbers After Self (Hard, Fenwick Tree)
    - And 18 more problems from LeetCode’s “Segment Tree” tag.
  - **Disjoint Set Union (20 Problems)**:
    - #323: Number of Connected Components in an Undirected Graph (Medium, DSU)
    - #684: Redundant Connection (Medium, DSU)
    - #721: Accounts Merge (Medium, DSU)
    - And 17 more problems from LeetCode’s “Union Find” tag.
  - **Bit Manipulation (20 Problems)**:
    - #136: Single Number (Easy, Bit Manipulation)
    - #190: Reverse Bits (Easy, Bit Manipulation)
    - #191: Number of 1 Bits (Easy, Bit Manipulation)
    - #338: Counting Bits (Medium, Bit Manipulation)
    - And 16 more problems from LeetCode’s “Bit Manipulation” tag.
  - **Milestone**: Solve 60 problems, participate in 3-5 Codeforces contests.

## Daily Schedule
- **Morning (5:45 AM - 8:00 AM, 2h15m)**:
  - **5:45 AM - 6:45 AM**: Study theory (GeeksforGeeks, NeetCode videos) or review weak areas.
  - **6:45 AM - 8:00 AM**: Implement data structure/algorithm or solve 2-3 problems.
- **Evening (6:45 PM - 9:30 PM, 2h45m)**:
  - **6:45 PM - 7:30 PM**: Complete implementation or review theory.
  - **7:30 PM - 9:30 PM**: Solve 3-4 problems or practice mock interviews (Pramp, Interviewing.io).
- **Weekends**: 7-8 hours/day (e.g., 9 AM - 1 PM, 2 PM - 5 PM) for 8-10 problems, mock interviews, or contests.

## Tips for Success
- **Java-Specific Tips**:
  - Use `HashMap`/`HashSet` for efficient lookups (e.g., Two Sum, Group Anagrams).
  - Leverage `StringBuilder` for string manipulation (e.g., Longest Palindromic Substring).
  - Use `PriorityQueue` for heap-based problems (e.g., Top K Frequent Elements).
  - Implement linked lists with custom `ListNode` class (e.g., Reverse Linked List).
  - Optimize tree traversals with recursion or iterative approaches (e.g., Binary Tree Level Order Traversal).
- **Startup Interview Focus**:
  - Mid-sized startups emphasize practical problems (e.g., Two Sum, LRU Cache, Meeting Rooms II) relevant to backend systems, REST APIs, and microservices.
  - Expect 2-3 coding rounds (Easy/Medium problems) and 1 basic system design round (e.g., design a URL shortener or notification system).
  - Communication and code clarity are critical; practice explaining solutions aloud.
- **Application to Work**: Apply DSA to your email management system (e.g., HashSet for deduplication, PriorityQueue for prioritized email processing, graphs for email thread relationships).
- **Progress Tracking**: Log problems in a spreadsheet (problem number, title, difficulty, date solved, notes on approach).
- **Mock Interviews**: Complete 10-12 mock interviews by Month 6, focusing on startup-like problems.
- **20 LPA Strategy**:
  - Target **SDE-2 or equivalent roles** at mid-sized startups.
  - Highlight DSA proficiency, Java expertise, and project experience on your resume and LinkedIn.
  - Network with recruiters or employees via LinkedIn, Cutshort, or AngelList.
  - Prepare basic system design alongside DSA.

## Additional Platforms
- **HackerRank**: For Java-specific DSA challenges.
- **Codeforces**: For competitive programming (Months 7-8).
- **LeetCode Premium**: Optional for company-tagged problems.
- **NeetCode’s 150 List**: For curated problems.

## Progress Milestones
- **Month 2**: Master basic data structures, 120 problems solved.
- **Month 4**: Proficient in trees, heaps, graphs, hashing, 235 problems solved.
- **Month 6**: Interview-ready, 350 problems solved, 10-12 mock interviews completed.
- **Month 8 (if extended)**: Advanced DSA mastery, competitive programming skills.