package com.xworkz.repositery;
import org.springframework.stereotype.Repository;

	import com.xworkz.dto.BakeryDTO;

	@Repository
	public class BakeryRepositeryImpl implements BakeryRepositery {
		public BakeryRepositeryImpl() {
			System.out.println("created " + this.getClass().getSimpleName());
		}

		@Override
		public boolean saved(BakeryDTO dto) {
			System.out.println("Running save in repositery impl");
			return false;
		}

	}


