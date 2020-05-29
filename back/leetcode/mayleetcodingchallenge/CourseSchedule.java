package mayleetcodingchallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {
	public static void main(String[] args) {
		System.out.println(canFinish(2, new int[][] { { 1, 0 }, { 0, 1 } }));
	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		List<List<Integer>> edges = new ArrayList<>();

		for (int i = 0; i < numCourses; i++)
			edges.add(new ArrayList<Integer>());

		for (int[] edge : prerequisites) {
			indegree[edge[0]]++;
			edges.get(edge[1]).add(edge[0]);
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		Set<Integer> visited = new HashSet<>();

		while (!q.isEmpty()) {
			int node = q.poll();
			visited.add(node);
			for (int dest : edges.get(node)) {
				if (--indegree[dest] == 0)
					q.offer(dest);
			}
			edges.get(node).clear();
		}

		return visited.size() == numCourses;
	}

}
